package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDetailVo {
	private int od_no;
	private int o_no;
	private int g_no;
	private int od_qty;
	private int price;
}
