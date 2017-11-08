package com.invoice.aipxperts.Fragment;


import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.invoice.aipxperts.Activity.AddCompanyProfileActivity;
import com.invoice.aipxperts.R;
import com.invoice.aipxperts.databinding.CompanyDetailFragmentLayoutBinding;

import java.util.UUID;

/**
 * Created by aipxperts-ubuntu-01 on 30/10/17.
 */

public class CompanyDetailFragment extends Fragment {
    CompanyDetailFragmentLayoutBinding mBinding;
    Context context;
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(
                inflater, R.layout.company_detail_fragment_layout, container, false);
        rootView = mBinding.getRoot();
        context = getActivity();

        mBinding.txtDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AddCompanyProfileActivity)context).SetCompanyId(UUID.randomUUID().toString());
                ((AddCompanyProfileActivity)context).SetCompanyName(mBinding.edtName.getText().toString());
                ((AddCompanyProfileActivity)context).SetCompanyEmailId(mBinding.edtEmailId.getText().toString());
                ((AddCompanyProfileActivity)context).SetCompanyPhoneNumber(mBinding.edtPhoneNumber.getText().toString());
                ((AddCompanyProfileActivity)context).SetCompanyAddress(mBinding.edtAddress.getText().toString());
                ((AddCompanyProfileActivity)context).SetCompanyCity(mBinding.edtCity.getText().toString());
                ((AddCompanyProfileActivity)context).SetCompanyState(mBinding.edtState.getText().toString());
                ((AddCompanyProfileActivity)context).SetCompanyPincode(mBinding.edtZip.getText().toString());
                ((AddCompanyProfileActivity)context).SetCountry(mBinding.edtCountry.getText().toString());

                ((AddCompanyProfileActivity)context).mBinding.viewPager1.setCurrentItem(1);
            }
        });


        return rootView;
    }
}
