package com.example.qwert.contract;

import android.content.Intent;

import com.example.qwert.contract.base.IBasePresenter;
import com.example.qwert.contract.base.IBaseView;

import java.io.File;

public interface MainContract {

    interface IView extends IBaseView, IBasePresenter {

    }

    interface IPresenter extends IBasePresenter {
        /**
         * 上传图片
         */
        void upLoadImagePicker();

        /**
         * 微信
         */
        void upLoadImagePickerWeiXin();

        /**
         * 自己上传图片
         */
        void upLoadImage();


        void onUpLoadResult(int requestCode, int resultCode, Intent data);

        /**
         * 清楚缓存
         */
        String clearData(String dataSize);

        /**
         * 初始化Imagepicker
         */
        void initImagePicker();

        /**
         * 获取缓存大小
         */
        File getDataMangerSize();

        /**
         * 生成随机密码
         */
        String createRandomCode();

        /**
         * dialog实例
         */
        void instanceDialog();


        /**
         * 系统分享功能
         */
        void SystemShare();

        /**
         * 系统短信发送功能
         */
        void SystemSms();

    }

}
