package com.xlauncher.dao;

import com.xlauncher.entity.VirtualDevice;
import com.xlauncher.util.Initialise;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * VirtualDeviceDaoTest
 * @author baishuailei
 * @since 2018-05-9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:spring-*.xml"})
@Transactional
public class VirtualDeviceDaoTest {
    @Autowired
    VirtualDeviceDao virtualDeviceDao;
    private static VirtualDevice virtualDevice;
    @BeforeClass()
    public static void init() {
        virtualDevice = new VirtualDevice();
        virtualDevice.setVirtualDeviceId(Initialise.initialise());
        virtualDevice.setVirtualDeviceName("VirtualDeviceDaoTest03");
        virtualDevice.setVirtualDeviceIp("8.11.0.03");
        virtualDevice.setVirtualDevicePort("8080");
        virtualDevice.setVirtualDeviceUserName("VirtualDeviceDaoTest");
        virtualDevice.setVirtualDeviceUserPassword("20180509");
        virtualDevice.setVirtualDeviceModel("201805091633");
        virtualDevice.setVirtualDeviceType("dvr");
        virtualDevice.setVirtualDeviceChannelCount(250);
        virtualDevice.setVirtualDeviceOrgId(3);
        virtualDevice.setVirtualDeviceDivisionId(3);
        virtualDevice.setVirtualDeviceCreateTime("2018-05-09 16:30:25");
    }
    @Test
    public void countPage() throws SQLException {
        System.out.println("countPage：" + this.virtualDeviceDao.countPage("undefined",0,"undefined","undefined","undefined"));
    }

    @Test
    public void listVirtualDevice() throws SQLException {
        System.out.println("listVirtualDevice：" + this.virtualDeviceDao.listVirtualDevice("undefined",0,1,"undefined","undefined","undefined"));
    }

    @Test
    public void insertVirtualDevice() throws SQLException {
        System.out.println("insertVirtualDevice：" + this.virtualDeviceDao.insertVirtualDevice(virtualDevice));
    }

    @Test
    public void deleteVirtualDevice() throws SQLException {
        System.out.println("deleteVirtualDevice：" + this.virtualDeviceDao.deleteVirtualDevice("230f06945c584e6ba400682c94ec1892"));
    }

    @Test
    public void updateVirtualDevice() throws SQLException {
        VirtualDevice virtualDeviceUp = new VirtualDevice();
        virtualDeviceUp.setVirtualDeviceId("8d5265e1d9b74e548d58eff619a3c6d6");
        virtualDeviceUp.setVirtualDeviceUpdateTime("2018-05-09 16:49:50");
        System.out.println("updateVirtualDevice：" + this.virtualDeviceDao.updateVirtualDevice(virtualDeviceUp));
    }

    @Test
    public void updateRuntimeVirtualDevice() throws SQLException {
        VirtualDevice virtualDeviceUpRuntime = new VirtualDevice();
        virtualDeviceUpRuntime.setVirtualDeviceId("8d5265e1d9b74e548d58eff619a3c6d6");
        virtualDeviceUpRuntime.setVirtualDeviceFaultCode(2);
        System.out.println("updateRuntimeVirtualDevice：" + this.virtualDeviceDao.updateRuntimeVirtualDevice(virtualDeviceUpRuntime));
    }

    @Test
    public void getVirtualDeviceByVirtualDeviceId() throws SQLException {
        System.out.println("getVirtualDeviceByVirtualDeviceId：" + this.virtualDeviceDao.getVirtualDeviceByVirtualDeviceId("8d5265e1d9b74e548d58eff619a3c6d6"));
    }

}