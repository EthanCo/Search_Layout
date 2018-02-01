package scut.carson_ho.searchview;

/**
 * 当Text改变
 *
 * @author EthanCo
 * @since 2018/2/1
 */

public interface TextChangeCallBack {
    void onTextChange(CharSequence text,int start, int before, int count);
}
