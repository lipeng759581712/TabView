package star.yx.tabfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import star.yx.tabview.R;

/**
 * Created by yx on 16/4/3.
 */
public class WechatFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragent_layout_wechat, container, false);
        return view;
    }

}
