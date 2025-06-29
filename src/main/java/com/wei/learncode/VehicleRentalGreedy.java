package com.wei.learncode;

import java.util.*;

class RentalRequest1 {
    int startTime; // 请求开始时间
    int endTime;   // 请求结束时间

    public RentalRequest1(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}

class AllocatedRequest1 {
    int vehicleId;  // 代表车辆ID
    int startTime;  // 起始时间
    int endTime;    // 结束时间

    public AllocatedRequest1(int vehicleId, int startTime, int endTime) {
        this.vehicleId = vehicleId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Vehicle " + vehicleId + " assigned from " + startTime + " to " + endTime;
    }
}

class Vehicle {
    int id; // 车辆ID
    TreeSet<RentalRequest1> reservations; // 优化为TreeSet以保持排序并实现快速查找

    public Vehicle(int id) {
        this.id = id;
        this.reservations = new TreeSet<>(Comparator.comparingInt(r -> r.startTime));
    }

    // 添加请求到车辆的预约中
    public boolean addReservation(RentalRequest1 request) {
        // 查找重叠的预约
        RentalRequest1 floorReservation = reservations.floor(new RentalRequest1(request.startTime, 0));
        RentalRequest1 ceilingReservation = reservations.ceiling(request);

        // 检查是否存在重叠
        if ((floorReservation != null && floorReservation.endTime > request.startTime) ||
                (ceilingReservation != null && ceilingReservation.startTime < request.endTime)) {
            return false; // 存在重叠，无法插入
        }

        // 添加请求
        reservations.add(request);
        return true;
    }
}

public class VehicleRentalGreedy {
    public static List<AllocatedRequest1> maximizeRentals(int numberOfVehicles, RentalRequest1[] requests, RentalRequest1[][] existingReservations) {
        List<Vehicle> vehicles = new ArrayList<>();

        // 1. 初始化车辆并添加已有占用时间段
        for (int vehicleId = 0; vehicleId < numberOfVehicles; vehicleId++) {
            Vehicle vehicle = new Vehicle(vehicleId);
            if (existingReservations[vehicleId] != null) {
                for (RentalRequest1 reservation : existingReservations[vehicleId]) {
                    vehicle.reservations.add(reservation);
                }
            }
            vehicles.add(vehicle);
        }

        // 2. 尝试将每个请求插入到每辆车的预约之中
        List<AllocatedRequest1> allocatedRequests = new ArrayList<>(); // 存储已分配的请求
        for (RentalRequest1 request : requests) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.addReservation(request)) {
                    // 请求成功插入
                    allocatedRequests.add(new AllocatedRequest1(vehicle.id, request.startTime, request.endTime));
                    break; // 找到可用车辆后跳出循环，处理下一个请求
                }
            }
        }

        return allocatedRequests; // 返回所有已分配的请求
    }

    public static void main(String[] args) {
        RentalRequest1[] requests = {
                new RentalRequest1(1, 2),
                new RentalRequest1(4, 6),
                new RentalRequest1(2, 4)
        };

        // 每辆车的已有占用时间段
        RentalRequest1[][] existingReservations = new RentalRequest1[4][];
        existingReservations[0] = null;
        existingReservations[1] = new RentalRequest1[]{new RentalRequest1(2, 3)};
        existingReservations[2] = null; // 车辆未占用
        existingReservations[3] = null;

        int numberOfVehicles = 4;
        List<AllocatedRequest1> assignedRequests = maximizeRentals(numberOfVehicles, requests, existingReservations);

        // 输出分配结果
        for (AllocatedRequest1 allocatedRequest : assignedRequests) {
            System.out.println(allocatedRequest);
        }
    }
}
