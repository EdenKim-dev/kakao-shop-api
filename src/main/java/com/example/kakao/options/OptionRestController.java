package com.example.kakao.options;

import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao._core.utils.ApiUtils.ApiResult;
import com.example.kakao.products.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.kakao._core.utils.ApiUtils.success;
import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
@RestController
public class OptionRestController {

    private final OptionService optionService;

    /**
     * @param id
     * ProductId에 해당하는 Option 조회
     * @return
     * 성공 시 Option 리스트 반환
     */
    @GetMapping("/products/{id}/options")
    public ResponseEntity<?> findByProductId(@PathVariable int id) {
        List<OptionResponse.FindByProductIdDTO> responseDTO = optionService.findByProductId(id);
        ApiUtils.ApiResult<?> apiResult = ApiUtils.success(responseDTO);
        return ResponseEntity.ok(apiResult);
    }

    /**
     * @return
     * Option 전체 반환
     */
    @GetMapping("/options")
    public ResponseEntity<?> findAll() {
        List<OptionResponse.FindAllDTO> responseDTO = optionService.findAll();
        ApiUtils.ApiResult<?> apiResult = ApiUtils.success(responseDTO);
        return ResponseEntity.ok(apiResult);
    }
}
