/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: G:\\workspace\\AidlComminication\\src\\com\\example\\aidlcomminication\\IRemoteCallBack.aidl
 */
package com.example.aidlcomminication;
public interface IRemoteCallBack extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.aidlcomminication.IRemoteCallBack
{
private static final java.lang.String DESCRIPTOR = "com.example.aidlcomminication.IRemoteCallBack";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.aidlcomminication.IRemoteCallBack interface,
 * generating a proxy if needed.
 */
public static com.example.aidlcomminication.IRemoteCallBack asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.aidlcomminication.IRemoteCallBack))) {
return ((com.example.aidlcomminication.IRemoteCallBack)iin);
}
return new com.example.aidlcomminication.IRemoteCallBack.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_isDownloadCompleted:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDownloadCompleted();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.aidlcomminication.IRemoteCallBack
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public boolean isDownloadCompleted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDownloadCompleted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_isDownloadCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public boolean isDownloadCompleted() throws android.os.RemoteException;
}
