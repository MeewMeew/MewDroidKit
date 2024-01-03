package mew.id.vn.mewdroidkit;

import android.content.Context;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

public class ConfirmDialogHelper {
    private AlertDialog.Builder builder;
    private String positiveButtonLabel = "Thực hiện";
    private String negativeButtonLabel = "Huỷ";

    public ConfirmDialogHelper(Context context) {
        this.builder = new AlertDialog.Builder(context);
    }

    public void setTitle(String title) {
        this.builder.setTitle(title);
    }

    public void setMessage(String message) {
        this.builder.setMessage(message);
    }

    public void setPositiveButtonLabel(String label) {
        this.positiveButtonLabel = label;
    }

    public void setNegativeButtonLabel(String label) {
        this.negativeButtonLabel = label;
    }

    public void setPositiveButtonEvent(final DialogInterface.OnClickListener listener) {
        this.builder.setPositiveButton(positiveButtonLabel, listener);
    }

    public void setNegativeButtonEvent(final DialogInterface.OnClickListener listener) {
        this.builder.setNegativeButton(negativeButtonLabel, listener);
    }

    public void show() {
        AlertDialog alertDialog = this.builder.create();
        alertDialog.show();
    }
}
