package com.consistent.ucwrt.service.messaging;

import com.consistent.ucwrt.service.ClpSerializer;
import com.consistent.ucwrt.service.EntityAddressLocalServiceUtil;
import com.consistent.ucwrt.service.EntityAddressServiceUtil;
import com.consistent.ucwrt.service.EntityBrandLocalServiceUtil;
import com.consistent.ucwrt.service.EntityBrandServiceUtil;
import com.consistent.ucwrt.service.EntityBusinessBrandLocalServiceUtil;
import com.consistent.ucwrt.service.EntityBusinessBrandServiceUtil;
import com.consistent.ucwrt.service.EntityClassLocalServiceUtil;
import com.consistent.ucwrt.service.EntityClassServiceUtil;
import com.consistent.ucwrt.service.EntityCustomerLocalServiceUtil;
import com.consistent.ucwrt.service.EntityCustomerServiceUtil;
import com.consistent.ucwrt.service.EntityDealerLocalServiceUtil;
import com.consistent.ucwrt.service.EntityDealerServiceUtil;
import com.consistent.ucwrt.service.EntityDepartmentLocalServiceUtil;
import com.consistent.ucwrt.service.EntityDepartmentServiceUtil;
import com.consistent.ucwrt.service.EntityEmployeesLocalServiceUtil;
import com.consistent.ucwrt.service.EntityEmployeesServiceUtil;
import com.consistent.ucwrt.service.EntityEmploymentLocalServiceUtil;
import com.consistent.ucwrt.service.EntityEmploymentServiceUtil;
import com.consistent.ucwrt.service.EntityEquipmentLocalServiceUtil;
import com.consistent.ucwrt.service.EntityEquipmentServiceUtil;
import com.consistent.ucwrt.service.EntityEventLocalServiceUtil;
import com.consistent.ucwrt.service.EntityEventServiceUtil;
import com.consistent.ucwrt.service.EntityGParameterLocalServiceUtil;
import com.consistent.ucwrt.service.EntityGParameterServiceUtil;
import com.consistent.ucwrt.service.EntityIntervalosLocalServiceUtil;
import com.consistent.ucwrt.service.EntityIntervalosServiceUtil;
import com.consistent.ucwrt.service.EntityInventoryClasificationLocalServiceUtil;
import com.consistent.ucwrt.service.EntityInventoryClasificationServiceUtil;
import com.consistent.ucwrt.service.EntityInventoryLocalServiceUtil;
import com.consistent.ucwrt.service.EntityInventoryServiceUtil;
import com.consistent.ucwrt.service.EntityModelLocalServiceUtil;
import com.consistent.ucwrt.service.EntityModelServiceUtil;
import com.consistent.ucwrt.service.EntityMonthlySalesGoalLocalServiceUtil;
import com.consistent.ucwrt.service.EntityMonthlySalesGoalServiceUtil;
import com.consistent.ucwrt.service.EntityMunicipalityLocalServiceUtil;
import com.consistent.ucwrt.service.EntityMunicipalityServiceUtil;
import com.consistent.ucwrt.service.EntityProspectionLocalServiceUtil;
import com.consistent.ucwrt.service.EntityProspectionServiceUtil;
import com.consistent.ucwrt.service.EntitySaleLocalServiceUtil;
import com.consistent.ucwrt.service.EntitySaleServiceUtil;
import com.consistent.ucwrt.service.EntitySalesPlaceLocalServiceUtil;
import com.consistent.ucwrt.service.EntitySalesPlaceServiceUtil;
import com.consistent.ucwrt.service.EntitySourceOfSupplyLocalServiceUtil;
import com.consistent.ucwrt.service.EntitySourceOfSupplyServiceUtil;
import com.consistent.ucwrt.service.EntityStateLocalServiceUtil;
import com.consistent.ucwrt.service.EntityStateServiceUtil;
import com.consistent.ucwrt.service.EntityStatusLocalServiceUtil;
import com.consistent.ucwrt.service.EntityStatusServiceUtil;
import com.consistent.ucwrt.service.EntitySuburbLocalServiceUtil;
import com.consistent.ucwrt.service.EntitySuburbServiceUtil;
import com.consistent.ucwrt.service.EntityVersionAutoLocalServiceUtil;
import com.consistent.ucwrt.service.EntityVersionAutoServiceUtil;
import com.consistent.ucwrt.service.EntityVersionEquipmentLocalServiceUtil;
import com.consistent.ucwrt.service.EntityVersionEquipmentServiceUtil;
import com.consistent.ucwrt.service.EntityWayToPayLocalServiceUtil;
import com.consistent.ucwrt.service.EntityWayToPayServiceUtil;
import com.consistent.ucwrt.service.EntityYearModelClassLocalServiceUtil;
import com.consistent.ucwrt.service.EntityYearModelClassServiceUtil;
import com.consistent.ucwrt.service.EntityYearModelLocalServiceUtil;
import com.consistent.ucwrt.service.EntityYearModelServiceUtil;
import com.consistent.ucwrt.service.EntityZoneLocalServiceUtil;
import com.consistent.ucwrt.service.EntityZoneServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            EntityAddressLocalServiceUtil.clearService();

            EntityAddressServiceUtil.clearService();
            EntityBrandLocalServiceUtil.clearService();

            EntityBrandServiceUtil.clearService();
            EntityBusinessBrandLocalServiceUtil.clearService();

            EntityBusinessBrandServiceUtil.clearService();
            EntityClassLocalServiceUtil.clearService();

            EntityClassServiceUtil.clearService();
            EntityCustomerLocalServiceUtil.clearService();

            EntityCustomerServiceUtil.clearService();
            EntityDealerLocalServiceUtil.clearService();

            EntityDealerServiceUtil.clearService();
            EntityDepartmentLocalServiceUtil.clearService();

            EntityDepartmentServiceUtil.clearService();
            EntityEmployeesLocalServiceUtil.clearService();

            EntityEmployeesServiceUtil.clearService();
            EntityEmploymentLocalServiceUtil.clearService();

            EntityEmploymentServiceUtil.clearService();
            EntityEquipmentLocalServiceUtil.clearService();

            EntityEquipmentServiceUtil.clearService();
            EntityEventLocalServiceUtil.clearService();

            EntityEventServiceUtil.clearService();
            EntityGParameterLocalServiceUtil.clearService();

            EntityGParameterServiceUtil.clearService();
            EntityIntervalosLocalServiceUtil.clearService();

            EntityIntervalosServiceUtil.clearService();
            EntityInventoryLocalServiceUtil.clearService();

            EntityInventoryServiceUtil.clearService();
            EntityInventoryClasificationLocalServiceUtil.clearService();

            EntityInventoryClasificationServiceUtil.clearService();
            EntityModelLocalServiceUtil.clearService();

            EntityModelServiceUtil.clearService();
            EntityMonthlySalesGoalLocalServiceUtil.clearService();

            EntityMonthlySalesGoalServiceUtil.clearService();
            EntityMunicipalityLocalServiceUtil.clearService();

            EntityMunicipalityServiceUtil.clearService();
            EntityProspectionLocalServiceUtil.clearService();

            EntityProspectionServiceUtil.clearService();
            EntitySaleLocalServiceUtil.clearService();

            EntitySaleServiceUtil.clearService();
            EntitySalesPlaceLocalServiceUtil.clearService();

            EntitySalesPlaceServiceUtil.clearService();
            EntitySourceOfSupplyLocalServiceUtil.clearService();

            EntitySourceOfSupplyServiceUtil.clearService();
            EntityStateLocalServiceUtil.clearService();

            EntityStateServiceUtil.clearService();
            EntityStatusLocalServiceUtil.clearService();

            EntityStatusServiceUtil.clearService();
            EntitySuburbLocalServiceUtil.clearService();

            EntitySuburbServiceUtil.clearService();
            EntityVersionAutoLocalServiceUtil.clearService();

            EntityVersionAutoServiceUtil.clearService();
            EntityVersionEquipmentLocalServiceUtil.clearService();

            EntityVersionEquipmentServiceUtil.clearService();
            EntityWayToPayLocalServiceUtil.clearService();

            EntityWayToPayServiceUtil.clearService();
            EntityYearModelLocalServiceUtil.clearService();

            EntityYearModelServiceUtil.clearService();
            EntityYearModelClassLocalServiceUtil.clearService();

            EntityYearModelClassServiceUtil.clearService();
            EntityZoneLocalServiceUtil.clearService();

            EntityZoneServiceUtil.clearService();
        }
    }
}
