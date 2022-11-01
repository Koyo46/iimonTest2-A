package com.example.fruit;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor

public class FruitController {

  private final FruitRepository fruitRepository;
  private final FruitEntity fruitEntity;
  private int status = 0;

  @GetMapping(value="/fruit")
  public ModelAndView showFruits(ModelAndView mv) {

    mv.setViewName("FruitList");
    List<FruitEntity> fruitList = fruitRepository.findAll();
    mv.addObject("fruitList", fruitList);
    return mv;
    }



  @PostMapping(value="/" ,consumes=MediaType.APPLICATION_JSON_VALUE)
  public int insert(@RequestBody FruitBean fruit) {

    fruitEntity.setName(fruit.getName());
    fruitEntity.setPrice(fruit.getPrice());


    fruitRepository.save(fruitEntity);

    return status;

  }
}
