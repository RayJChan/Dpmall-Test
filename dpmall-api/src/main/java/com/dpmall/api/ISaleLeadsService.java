package com.dpmall.api;

import java.util.List;

import com.dpmall.api.bean.SaleLeadsModel;
import com.dpmall.api.common.TimeScope;
import com.dpmall.api.param.SaleLeadStatisticForm;

/**
 * 销售线索类服务接口
 * @author river
 * @since 2017-07-10
 */
public interface ISaleLeadsService {
	
	/**
	 * 经销商获取待分配的销售线索
	 * @param distributorId 经销商Id
	 * @param startNum 上一次加载的位移
	 * @param pageSize 页的大小
	 * @return 经销商获取待分配的销售线索列表
	 */
    public List<SaleLeadsModel> getOnePage4Distribute(String distributorId,Integer startNum, Integer pageSize);
    
    /**
     * 获取经销商待分配的线索数
     * @param distributorId 经销商ID
     * @return 经销商待分配的线索数
     */
    public Integer get2DistributeCount(String distributorId);
    
    
    /**
     * 经销商下派到店铺
     * @param distributorId 经销商ID
     * @param saleLeadsId 销售线索ID
     * @param shopId 店铺ID
     * @return
     */
    public int distribute(String distributorId,String saleLeadsId, String shopId);
    
    /**
     * 经销商拒单
     * @param distributorId 经销商ID
     * @param saleLeadsId 销售线索ID
     * @param rejectType 拒单类型
     * @param rejectRemark 拒单备注
     * @return
     */
    public int reject(String distributorId, String saleLeadsId, String rejectType, String rejectRemark);
    
    
    /**
     * 经销商获取待跟进的一页线索订单数据
	 * @param distributorId 经销商Id
	 * @param startItemId 上一次加载的最后项ID
	 * @param pageSize 页的大小
     * @return
     */
    public List<SaleLeadsModel> getOnePage4Followup(String distributorId,Integer startNum, Integer pageSize);
    
    /**
     * 根据条件查询已完结的销售线索订单
     * @param distributorId 经销商Id
     * @param distributeTime 订单下派时间
     * @param storeId
     * @param saleLeadId
     * @param clientName
     * @param clientTel
     * @param startNum
     * @param pageSize
     * @return
     */
    public List<SaleLeadsModel> getOnePageClosedSaleLeads(String distributorId,TimeScope distributeTime, String storeId,String saleLeadId, String clientName,String clientTel,Integer startNum, Integer pageSize);
    
    
	/**
	 * 店铺获取待接单的销售线索
	 * @param storeId 店铺ID
	 * @param startNum 上一次加载的最后项位移
	 * @param pageSize 页的大小
	 * @return 店铺获取待接单的销售线索列表
	 */
    public List<SaleLeadsModel> getOnePage4Accept(String storeId,Integer startNum, Integer pageSize);
    
    /**
     * 获取店铺待接单的线索数
     * @param storeId 经销商ID
     * @return 经销商待分配的线索数
     */
    public Integer get2AcceptCount(String storeId);
    
    
    
    /**
     * 导购员接单
     * @param acceptorId 导购员ID
     * @param saleLeadsId 线索ID
     * @return
     */
    public int accept(String acceptorId, String saleLeadsId);
    
    /**
     * 编辑销售线索订单信息
     * @param model
     * @return
     */
    public int edit(SaleLeadsModel model);
 
    
    /**
     * 获取导购员已接单的一页销售线索信息
     * @param acceptorId 导购员ID
     * @param startNum 上一次加载的最后项位移
     * @param pageSize 页大小
     * @return
     */
    public List<SaleLeadsModel> getOnePage4Acceptor2Followup(String acceptorId,Integer startNum, Integer pageSize);
    
    /**
     * 获取导购员已结单的一页销售线索信息
     * @param acceptorId 导购员ID
     * @param startItemId 上一次加载的最后项位移
     * @param pageSize 页大小
     * @return
     */
    public List<SaleLeadsModel> getOnePage4AcceptorClosed(String acceptorId,Integer startNum, Integer pageSize);
    
    /**
     * 获取根据form条件查询一页的成功结单的数据
     * @param form
     * @param startNum
     * @param pageSize
     * @return
     */
    public List<SaleLeadsModel> getOnePageSuccessOrders(SaleLeadStatisticForm form,Integer startNum, Integer pageSize);
    
    
    /**
     * 获取根据form条件查询成功结单的金额
     * @param form
     * @return
     */
    public Double getSuccessOrdersTtlAmount(SaleLeadStatisticForm form);
}
