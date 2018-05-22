package star.yx.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import star.yx.tabview.ITabClickListener;
import star.yx.tabview.R;

/**
 * Created by yx on 16/4/3.
 */
public class ProfileFragment extends BaseFragment implements ITabClickListener {
    @Override
    public void fetchData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_me, container, false);
        return view;
    }

    @Override
    public void onMenuItemClick() {

    }

    @Override
    public BaseFragment getFragment() {
        return this;
    }
}
