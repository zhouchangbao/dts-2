package io.dts.common.api;

import io.dts.common.protocol.header.BeginMessage;
import io.dts.common.protocol.header.BeginResultMessage;
import io.dts.common.protocol.header.BeginRetryBranchMessage;
import io.dts.common.protocol.header.BeginRetryBranchResultMessage;
import io.dts.common.protocol.header.GlobalCommitMessage;
import io.dts.common.protocol.header.GlobalCommitResultMessage;
import io.dts.common.protocol.header.GlobalRollbackMessage;
import io.dts.common.protocol.header.GlobalRollbackResultMessage;
import io.dts.common.protocol.header.RegisterMessage;
import io.dts.common.protocol.header.RegisterResultMessage;

/**
 * @author jiangyu.jy
 * 
 *         TXC 消息处理器
 */
public interface DtsServerMessageHandler {

  /**
   * 开始一个分布式事务
   * 
   */
  public void handleMessage(String clientIp, BeginMessage message,
      BeginResultMessage resultMessage);

  /**
   * 处理全局事务提交
   * 
   */
  public void handleMessage(String clientIp, GlobalCommitMessage message,
      GlobalCommitResultMessage resultMessage);

  /**
   * 处理全局事务回滚
   * 
   */
  public void handleMessage(String clientIp, GlobalRollbackMessage message,
      GlobalRollbackResultMessage resultMessage);

  /**
   * 处理事务分支注册
   * 
   */
  public void handleMessage(String clientIp, RegisterMessage message,
      RegisterResultMessage resultMessage);

  // /**
  // * 事务分支上报状态消息处理
  // *
  // */
  // public void handleMessage(String clientIp, ReportStatusMessage message,
  // ReportStatusResultMessage resultMessage);

  /**
   * 可重试事务分支处理
   * 
   */
  public void handleMessage(String clientIp, BeginRetryBranchMessage message,
      BeginRetryBranchResultMessage resultMessage);

  // /**
  // * 事务分支上报用户数据（udata）消息处理
  // *
  // */
  // public void handleMessage(String clientIp, ReportUdataMessage message,
  // ReportUdataResultMessage resultMessage);



}
