package com.example.demo.service.impl;

import com.example.demo.dto.ProductContainer;
import com.example.demo.dto.ProductDto;
import com.example.demo.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Override
    public ProductContainer getAllProducts() {


        ProductContainer productContainer = new ProductContainer();
        List<ProductDto> productDtoList = new ArrayList<>();

        ProductDto productDto1 = new ProductDto();
        productDto1.setId(101);
        productDto1.setProductname("jeans");
        productDto1.setDescription("clothing");
        productDto1.setPrice(50);

        ProductDto productDto2 = new ProductDto();
        productDto2.setId(102);
        productDto2.setProductname("top");
        productDto2.setDescription("clothing");
        productDto2.setPrice(150);

        ProductDto productDto3 = new ProductDto();
        productDto3.setId(103);
        productDto3.setProductname("skirt");
        productDto3.setDescription("clothing");
        productDto3.setPrice(100);

        ProductDto productDto4 = new ProductDto();
        productDto4.setId(104);
        productDto4.setProductname("suit");
        productDto4.setDescription("clothing");
        productDto4.setPrice(200);

        productDtoList.add(productDto1);
        productDtoList.add(productDto2);
        productDtoList.add(productDto3);
        productDtoList.add(productDto4);


        productContainer.setProducts(productDtoList);

        return productContainer;
    }

}


