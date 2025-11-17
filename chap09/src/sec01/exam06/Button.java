package sec01.exam06;

public class Button {
    onClickListener listener;

    void setOnClickListener(onClickListener listener){
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    public static interface onClickListener {
        void onClick();
    }
}
