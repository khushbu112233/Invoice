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
import com.invoice.aipxperts.databinding.CompanyBankDetailFragmentLayoutBinding;

/**
 * Created by aipxperts-ubuntu-01 on 30/10/17.
 */

public class CompanyBankDetailFragment extends Fragment {
    CompanyBankDetailFragmentLayoutBinding mBinding;
    Context context;
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(
                inflater, R.layout.company_bank_detail_fragment_layout, container, false);
        rootView = mBinding.getRoot();
        context = getActivity();

        mBinding.txtDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AddCompanyProfileActivity)context).SetCompanyBankName(mBinding.edtBankName.getText().toString());
                ((AddCompanyProfileActivity)context).Seta_cno(mBinding.edtAcNoId.getText().toString());
                ((AddCompanyProfileActivity)context).SetBranchName(mBinding.edtBranchName.getText().toString());
                ((AddCompanyProfileActivity)context).SetIFSCode(mBinding.edtIFCCode.getText().toString());

                ((AddCompanyProfileActivity)context).mBinding.viewPager1.setCurrentItem(2);
            }
        });


        return rootView;
    }
}
