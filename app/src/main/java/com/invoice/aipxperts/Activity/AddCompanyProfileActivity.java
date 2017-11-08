package com.invoice.aipxperts.Activity;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.invoice.aipxperts.Adapter.CompanyDetailPagerAdapter;
import com.invoice.aipxperts.R;
import com.invoice.aipxperts.databinding.ActivityAddCompanyProfileBinding;

/**
 * Created by aipxperts-ubuntu-01 on 30/10/17.
 */

public class AddCompanyProfileActivity extends FragmentActivity {
    Context context;
   public ActivityAddCompanyProfileBinding mBinding;
    String UserId;
    String UserName;
    String UserEmailId;
    String UserPhoneNumber;
    String Address;
    String City;
    String State;
    String Pincode;
    String Country;
    String BankName;
    String A_CNo;
    String BranchName;
    String IFSCode;
    String CompanyPAN;
    String TaxNo;
    String GSTNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Constants.StatusBar();
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_add_company_profile);


        final CompanyDetailPagerAdapter adapter = new CompanyDetailPagerAdapter
                (getSupportFragmentManager(), 3);
        mBinding.viewPager1.setAdapter(adapter);

        mBinding.viewPager1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position==0)
                {
                    mBinding.txtRecent.setTextColor(getResources().getColor(R.color.white));
                    mBinding.txtFuture.setTextColor(getResources().getColor(R.color.un_select_header));
                    mBinding.txtPast.setTextColor(getResources().getColor(R.color.un_select_header));

                }else if(position==1)
                {
                    mBinding.txtRecent.setTextColor(getResources().getColor(R.color.un_select_header));
                    mBinding.txtFuture.setTextColor(getResources().getColor(R.color.white));
                    mBinding.txtPast.setTextColor(getResources().getColor(R.color.un_select_header));

                }else if(position==2)
                {
                    mBinding.txtRecent.setTextColor(getResources().getColor(R.color.un_select_header));
                    mBinding.txtFuture.setTextColor(getResources().getColor(R.color.un_select_header));
                    mBinding.txtPast.setTextColor(getResources().getColor(R.color.white));

                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mBinding.txtRecent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mBinding.viewPager1.setCurrentItem(0);
                /*ListEventRecentFragment fragment = new ListEventRecentFragment();
                ((FragmentActivity)context).getSupportFragmentManager().beginTransaction().replace(R.id.frame_main_container, fragment).commit();
*/

            }
        });
        mBinding.txtFuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mBinding.viewPager1.setCurrentItem(1);
                /*
                ListEventFutureFragment fragment = new ListEventFutureFragment();
                ((FragmentActivity)context).getSupportFragmentManager().beginTransaction().replace(R.id.frame_main_container, fragment).commit();*/

            }
        });
        mBinding.txtPast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mBinding.viewPager1.setCurrentItem(2);
                /*  ListEventPastFragment fragment = new ListEventPastFragment();
                ((FragmentActivity)context).getSupportFragmentManager().beginTransaction().replace(R.id.frame_main_container, fragment).commit();
*/

            }
        });

    }
    public void SetCompanyId(String UserId)
    {
        this.UserId=UserId;
    }
    public String getCompanyId()
    {
        return UserId;
    }
    public void SetCompanyName(String UserName)
    {
        this.UserName=UserName;
    }
    public String getCompanyName()
    {
        return UserName;
    }

    public void SetCompanyEmailId(String UserEmailId)
    {
        this.UserEmailId=UserEmailId;
    }
    public String getCompanyEmailId()
    {
        return UserEmailId;
    }

    public void SetCompanyPhoneNumber(String UserPhoneNumber)
    {
        this.UserPhoneNumber=UserPhoneNumber;
    }
    public String getCompanyPhoneNumber()
    {
        return UserPhoneNumber;
    }

    public void SetCompanyAddress(String Address)
    {
        this.Address=Address;
    }
    public String getCompanyAddress()
    {
        return Address;
    }

    public void SetCompanyCity(String City)
    {
        this.City=City;
    }
    public String getCompanyCity()
    {
        return City;
    }

    public void SetCompanyState(String State)
    {
        this.State=State;
    }
    public String getCompanyState()
    {
        return State;
    }

    public void SetCompanyPincode(String Pincode)
    {
        this.Pincode=Pincode;
    }
    public String getCompanyPincode()
    {
        return Pincode;
    }

    public void SetCompanyBankName(String BankName)
    {
        this.BankName=BankName;
    }
    public String getCompanyBankName()
    {
        return BankName;
    }

    public void Seta_cno(String A_CNo)
    {
        this.A_CNo=A_CNo;
    }
    public String geta_cno()
    {
        return A_CNo;
    }

    public void SetBranchName(String BranchName)
    {
        this.BranchName=BranchName;
    }
    public String getBranchName()
    {
        return BranchName;
    }

    public void SetIFSCode(String IFSCode)
    {
        this.IFSCode=IFSCode;
    }
    public String getIFScode()
    {
        return IFSCode;
    }
    public void SetCompanyPAN(String CompanyPAN)
    {
        this.CompanyPAN=CompanyPAN;
    }
    public String getCompanyPAN()
    {
        return CompanyPAN;
    }

    public void SetTaxNo(String TaxNo)
    {
        this.TaxNo=TaxNo;
    }
    public String getTaxNo()
    {
        return TaxNo;
    }

    public void SetGstNo(String GSTNo)
    {
        this.GSTNo=GSTNo;
    }
    public String getGstNo()
    {
        return GSTNo;
    }

    public void SetCountry(String country)
    {
        this.Country=country;
    }
    public String getCountry()
    {
        return Country;
    }



}
