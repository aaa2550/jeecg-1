package com.jeecg.consumercontract.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 客户合同
 * @author onlineGenerator
 * @date 2017-10-23 18:29:29
 * @version V1.0   
 *
 */
@Entity
@Table(name = "consumer_contract", schema = "")
@SuppressWarnings("serial")
public class ConsumerContractEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建人登录名称*/
	private java.lang.String createBy;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新人名称*/
	private java.lang.String updateName;
	/**更新人登录名称*/
	private java.lang.String updateBy;
	/**更新日期*/
	private java.util.Date updateDate;
	/**客户公司*/
	@Excel(name="客户公司",width=15,dictTable ="consumer",dicCode ="id",dicText ="name")
	private java.lang.Integer consumerId;
	/**合同开始时间*/
	@Excel(name="合同开始时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date contractStartTime;
	/**合同结束时间*/
	@Excel(name="合同结束时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date contractEndTime;
	/**返点*/
	@Excel(name="返点",width=15)
	private java.lang.Double rebates;
	/**账期_天*/
	@Excel(name="账期_天",width=15)
	private java.lang.Integer accountDays;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")

	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */

	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public java.lang.String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */

	@Column(name ="CREATE_BY",nullable=true,length=50)
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */

	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */

	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */

	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(java.lang.String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */

	@Column(name ="UPDATE_DATE",nullable=true,length=20)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  客户公司
	 */

	@Column(name ="CONSUMER_ID",nullable=true,length=32)
	public java.lang.Integer getConsumerId(){
		return this.consumerId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  客户公司
	 */
	public void setConsumerId(java.lang.Integer consumerId){
		this.consumerId = consumerId;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  合同开始时间
	 */

	@Column(name ="CONTRACT_START_TIME",nullable=true,length=32)
	public java.util.Date getContractStartTime(){
		return this.contractStartTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  合同开始时间
	 */
	public void setContractStartTime(java.util.Date contractStartTime){
		this.contractStartTime = contractStartTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  合同结束时间
	 */

	@Column(name ="CONTRACT_END_TIME",nullable=true,length=32)
	public java.util.Date getContractEndTime(){
		return this.contractEndTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  合同结束时间
	 */
	public void setContractEndTime(java.util.Date contractEndTime){
		this.contractEndTime = contractEndTime;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  返点
	 */

	@Column(name ="REBATES",nullable=true,length=32)
	public java.lang.Double getRebates(){
		return this.rebates;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  返点
	 */
	public void setRebates(java.lang.Double rebates){
		this.rebates = rebates;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  账期_天
	 */

	@Column(name ="ACCOUNT_DAYS",nullable=true,length=32)
	public java.lang.Integer getAccountDays(){
		return this.accountDays;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  账期_天
	 */
	public void setAccountDays(java.lang.Integer accountDays){
		this.accountDays = accountDays;
	}
}
