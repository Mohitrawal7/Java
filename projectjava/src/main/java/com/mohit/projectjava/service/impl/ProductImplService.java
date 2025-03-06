package com.mohit.projectjava.service.impl;

import com.mohit.projectjava.dto.ProductDto;
import com.mohit.projectjava.model.Product;
import com.mohit.projectjava.repo.ProductRepo;
import com.mohit.projectjava.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductImplService implements ProductService {

    private final ProductRepo repo;

    public ProductImplService(ProductRepo repo) {
        this.repo = repo;
    }



    public List<ProductDto> getAllProducts() {
       // return repo.findAll();
        List<Product> all = repo.findAll();
        return all.stream().map(product -> toEntity(product)).collect(Collectors.toList());
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(ProductDto dto, MultipartFile imageFile) throws IOException {
        dto.setImageName(imageFile.getOriginalFilename());
        dto.setImageType(imageFile.getContentType());
        byte[] imageData;
        imageData = imageFile.getBytes();
        dto.setImageData(imageData);
        // product.setImageData(imageFile.getBytes());
        Product product = toDto(dto);
        return repo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        product.setImageData(imageFile.getBytes());
        product.setImageType(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return repo.save(product);
    }


    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return repo.searchProducts(keyword);
    }


//// product to product dto
    private Product toDto(ProductDto dto) {
        return Product.builder()
                .name(dto.getName())
                .brand(dto.getBrand())
                .price(dto.getPrice())
                .description(dto.getDescription())
                .category(dto.getCategory())
                .productAvailable(dto.isProductAvailable())
                .releaseDate(dto.getReleaseDate())
                .stockQuantity(dto.getStockQuantity())
                .imageName(dto.getImageName())
                .imageType(dto.getImageType())
                .imageData(dto.getImageData())
                .build();
    }


    private ProductDto toEntity(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .brand(product.getBrand())
                .price(product.getPrice())
                .description(product.getDescription())
                .category(product.getCategory())
                .productAvailable(product.isProductAvailable())
                .releaseDate(product.getReleaseDate())
                .stockQuantity(product.getStockQuantity())
                .imageName(product.getImageName())
                .imageType(product.getImageType())
                .imageData(product.getImageData())
                .build();
    }

}
