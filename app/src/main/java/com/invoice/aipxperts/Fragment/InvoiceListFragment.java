package com.invoice.aipxperts.Fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.invoice.aipxperts.R;
import com.invoice.aipxperts.databinding.InvoiceListLayoutBinding;

/**
 * Created by aipxperts-ubuntu-01 on 30/10/17.
 */

public class InvoiceListFragment extends Fragment {
    InvoiceListLayoutBinding mBinding;
    View rootView;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,  Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(
                inflater, R.layout.invoice_list_layout, container, false);
        rootView = mBinding.getRoot();
        context = getActivity();
        return rootView;
    }
}
