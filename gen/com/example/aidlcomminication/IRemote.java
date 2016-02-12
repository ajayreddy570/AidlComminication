/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: G:\\workspace\\AidlComminication\\src\\com\\example\\aidlcomminication\\IRemote.aidl
 */
package com.example.aidlcomminication;
public interface IRemote extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.aidlcomminication.IRemote
{
private static final java.lang.String DESCRIPTOR = "com.example.aidlcomminication.IRemote";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.aidlcomminication.IRemote interface,
 * generating a proxy if needed.
 */
public static com.example.aidlcomminication.IRemote asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.aidlcomminication.IRemote))) {
return ((com.example.aidlcomminication.IRemote)iin);
}
return new com.example.aidlcomminication.IRemote.Stub.Proxy(obj);
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
case TRANSACTION_getStatus:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getStatus();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_registerServiceCallBack:
{
data.enforceInterface(DESCRIPTOR);
com.example.aidlcomminication.IRemoteCallBack _arg0;
_arg0 = com.example.aidlcomminication.IRemoteCallBack.Stub.asInterface(data.readStrongBinder());
this.registerServiceCallBack(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPrecent:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPrecent();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.aidlcomminication.IRemote
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
@Override public boolean getStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatus, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerServiceCallBack(com.example.aidlcomminication.IRemoteCallBack cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerServiceCallBack, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPrecent() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPrecent, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_registerServiceCallBack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getPrecent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public boolean getStatus() throws android.os.RemoteException;
public void registerServiceCallBack(com.example.aidlcomminication.IRemoteCallBack cb) throws android.os.RemoteException;
public int getPrecent() throws android.os.RemoteException;
}
