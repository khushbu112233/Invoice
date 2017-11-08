package com.invoice.aipxperts.Fragment;


import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.invoice.aipxperts.Activity.AddCompanyProfileActivity;
import com.invoice.aipxperts.Activity.SelectTemplateActivity;
import com.invoice.aipxperts.Model.CompanyProfile;
import com.invoice.aipxperts.R;
import com.invoice.aipxperts.databinding.CompanyTaxDetailFragmentLayoutBinding;

import io.realm.Realm;

import static com.invoice.aipxperts.Activity.BaseActivity.realm;

/**
 * Created by aipxperts-ubuntu-01 on 30/10/17.
 */

public class CompanyTaxDetailFragment extends Fragment {
    CompanyTaxDetailFragmentLayoutBinding mBinding;
    Context context;
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(
                inflater, R.layout.company_tax_detail_fragment_layout, container, false);
        rootView = mBinding.getRoot();
        context = getActivity();

        mBinding.txtDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AddCompanyProfileActivity)context).SetCompanyPAN(mBinding.edtCompanyPan.getText().toString());
                ((AddCompanyProfileActivity)context).SetTaxNo(mBinding.edtTaxNo.getText().toString());
                ((AddCompanyProfileActivity)context).SetGstNo(mBinding.edtGstNo.getText().toString());



                realm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        Long tsLong = System.currentTimeMillis() / 1000;
                        String ts = tsLong.toString();
                        // Add a Category
                        CompanyProfile companyProfile = realm.createObject(CompanyProfile.class);

                        companyProfile.setUserId(((AddCompanyProfileActivity)context).getCompanyId());
                        companyProfile.setUserName(((AddCompanyProfileActivity)context).getCompanyName());
                        companyProfile.setUserEmailId(((AddCompanyProfileActivity)context).getCompanyEmailId());
                        companyProfile.setUserPhoneNumber(((AddCompanyProfileActivity)context).getCompanyPhoneNumber());
                        companyProfile.setAddress(((AddCompanyProfileActivity)context).getCompanyAddress());
                        companyProfile.setCity(((AddCompanyProfileActivity)context).getCompanyCity());
                        companyProfile.setState(((AddCompanyProfileActivity)context).getCompanyState());
                        companyProfile.setPincode(((AddCompanyProfileActivity)context).getCompanyPincode());
                        companyProfile.setCountry(((AddCompanyProfileActivity)context).getCountry());
                        companyProfile.setBranchName(((AddCompanyProfileActivity)context).getBranchName());
                        companyProfile.setA_CNo(((AddCompanyProfileActivity)context).geta_cno());
                        companyProfile.setBankName(((AddCompanyProfileActivity)context).getCompanyBankName());
                        companyProfile.setIFSCode(((AddCompanyProfileActivity)context).getIFScode());
                        companyProfile.setCompanyPAN(((AddCompanyProfileActivity)context).getCompanyPAN());
                        companyProfile.setTaxNo(((AddCompanyProfileActivity)context).getTaxNo());
                        companyProfile.setGSTNo(((AddCompanyProfileActivity)context).getGstNo());


                    }
                });

                Intent intent = new Intent(context, SelectTemplateActivity.class);
                startActivity(intent);
                ((FragmentActivity)context).finish();
            }
        });


        return rootView;
    }
}
