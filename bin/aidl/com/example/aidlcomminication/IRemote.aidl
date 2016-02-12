package com.example.aidlcomminication;
import com.example.aidlcomminication.IRemoteCallBack;


interface IRemote {
  boolean getStatus();
  void registerServiceCallBack(IRemoteCallBack cb);
  int getPrecent();
  
}
