package org.example;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static final String LONG_TEXT = """
            Lorum ipsum
            Lorum ipsum
            Lorum ipsum
            Lorum ipsum
            Lorum ipsum
            Lorum ipsum
            """;

    public static void main(String[] args) {
        record OrderItem(long productId, double price, int count) {
        }
        OrderItem[] orders = {
                new OrderItem(1L, 1.0d, 10),
                new OrderItem(2L, 1.2d, 5),
                new OrderItem(2L, 10.d, 1)};
        List<OrderItem> orders2 = new ArrayList<>(32);
        orders2.add(orders[0]);
        orders2.add(orders[1]);
        orders2.addAll(List.of(orders));
        var stream = orders2.stream().distinct();
        Set<OrderItem> uniqueOrders = stream.collect(Collectors.toSet());
        Set<OrderItem> unique2 = new HashSet<>(orders2);
        System.out.println(uniqueOrders);
        Map<Long, List<OrderItem>> productOrders = Arrays.stream(orders)
                .collect(Collectors.groupingBy(OrderItem::productId));
        Map<Long, List<OrderItem>> productOrders2 = new HashMap<>();
        for (var oi : orders) {
            var list = productOrders2.computeIfAbsent(oi.productId(), k -> new ArrayList<>());
            list.add(oi);
        }
        System.out.println(productOrders);
        System.out.println(productOrders2);

        double[] prices;
        int[] counts;
        int[] a = new int[0];


        var str1 = new String("classmethod");
        var str2 = new String("classmethod");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}