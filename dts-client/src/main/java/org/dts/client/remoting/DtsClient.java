package org.dts.client.remoting;

import com.quancheng.dts.exception.DtsException;
import com.quancheng.dts.message.response.TransactionBeginBody;
import com.quancheng.dts.rpc.remoting.protocol.RemotingCommand;

/**
 * Created by guoyubo on 2017/8/24.
 */
public interface DtsClient {

  void start();

  void shutdown();

  <T> T invokeSync(RemotingCommand request, Class<T> classOfT) throws DtsException;

  TransactionBeginBody begin(long timeout) throws DtsException;


  void commit(int retryTimes) throws DtsException;


  void rollback(int retryTimes) throws DtsException;

}
