package com.sogou.nlu.except;

import com.sogou.nlu.rpc.BaiduRpcErrno;

/**
 * Created by xuhuahai on 2017/11/29.
 */
public class WrongMagicNumException extends NrpcException {

    public WrongMagicNumException(String errorMessage){
        super(BaiduRpcErrno.Errno.EREQUEST,errorMessage);
    }

}
