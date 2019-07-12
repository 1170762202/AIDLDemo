package com.zlx.aidldemo.impl;
import com.zlx.aidldemo.model.Advert;

interface IAdvertManager{
    List getAdvertList();

    void addAdvert(in Advert ad);
}
