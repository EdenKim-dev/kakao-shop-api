package com.example.kakao.cartlist;

import com.example.kakao.options.Option;
import com.example.kakao.options.OptionJPARepository;
import com.example.kakao.products.Product;
import com.example.kakao.products.ProductJPARepository;
import com.example.kakao.users.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CartListService {

    private final CartListJPARepository cartListJPARepository;
    private final OptionJPARepository optionJPARepository;
    private final ProductJPARepository productJPARepository;

    /**
     * @param cartListDTOs
     * 선택한 상품을 장바구니에 담기(저장)
     * @return
     * 상품을 장바구니에 담고, 담은 상품을 다시 반환
     */
    public List<CartList> addCartList(List<CartListDto.Request> cartListDTOs, User user) {
        List<CartList> newCartLists = new ArrayList<>();

        for(CartListDto.Request cartListDTO : cartListDTOs) {
            cartListDTO.setCartId(user.getId());
            CartList newCartList = cartListDTO.toEntity();
            newCartLists.add(newCartList);
        }

        return cartListJPARepository.saveAll(newCartLists);
    }

    public List<CartList> update(List<CartListDto.Request> cartListDTOs, User user) {
        List<CartList> updateCartLists = new ArrayList<>();

        for(CartListDto.Request cartListDTO : cartListDTOs) {
            cartListDTO.setCartId(user.getId());
            CartList newCartList = cartListDTO.toEntity();
            updateCartLists.add(newCartList);
        }

        return cartListJPARepository.saveAll(updateCartLists);
    }

    public List<CartListDto.Response> findAll(User user) {
        List<CartList> cartLists = cartListJPARepository.findByCartIdOrderByOptionIdAsc(user.getId());
        List<CartListDto.Response> cartListDTOs = new ArrayList<>();

        for(CartList cartList : cartLists) {
            CartListDto.Response response = new CartListDto.Response(cartList);

            Option option = optionJPARepository.findById(cartList.getOptionId()).get();
            Product product = productJPARepository.findById(option.getProduct().getId()).get();
            response.setProductName(product.getProductName());
            response.setOptionName(option.getOptionName());

            cartListDTOs.add(response);
        }

        return cartListDTOs;
    }

    public void clear(User user) {
        cartListJPARepository.deleteByCartId(user.getId());
    }
}
