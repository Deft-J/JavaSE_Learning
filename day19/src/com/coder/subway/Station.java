package com.coder.subway;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Station {
    private static Map<Integer,String> stationMap;
    static {
        stationMap=new TreeMap<>();
        stationMap.put(1,"沿山大道站");
        stationMap.put(2,"凤凰山站");
        stationMap.put(3,"文德路站");
        stationMap.put(4,"河滨公园站");
        stationMap.put(5,"康安路站");
        stationMap.put(6,"南京工业大学站");
        stationMap.put(7,"兴隆路站");
        stationMap.put(8,"万寿路站");
        stationMap.put(9,"国际健康中心站");
    }

    public static Integer getIndex(String value) {
        if (stationMap.containsValue(value)) {
            for (Map.Entry<Integer,String> entry : stationMap.entrySet()) {
                if(value.equals(entry.getValue())){
                    return entry.getKey();
                }
            }
        }
        return null;
    }
    public static int calculate(String start, String end) {
        Integer startIndex=getIndex(start);
        Integer endIndex=getIndex(end);
        if(startIndex==null || endIndex==null){
            return -1;
        }else{
            return Math.abs(startIndex-endIndex);
        }
    }
    public static void charge(List<Passenger> list){
        for (Passenger p : list) {
            System.out.println(p.getName()+"坐地铁从"+p.getStart()+"到"+p.getEnd());
            int a=calculate(p.getStart(),p.getEnd());
            if(a<=3){
                System.out.println("乘坐"+a+"站，收费2元");
            }else if(a<=5){
                System.out.println("乘坐"+a+"站，收费3元");
            }else if(a<=7){
                System.out.println("乘坐"+a+"站，收费4元");
            }else{
                System.out.println("乘坐"+a+"站，收费5元");
            }
        }
    }
}
