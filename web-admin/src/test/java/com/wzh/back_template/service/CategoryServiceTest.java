package com.wzh.back_template.service;
import java.time.LocalDateTime;

import com.wzh.back_template.domain.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @auther wzh
 * @date 2020/5/3 - 13:22
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceTest {
    @Autowired
    CategoryService categoryService;
    @Test
    public void testSelect(){
        Category category = new Category();
        category.setCatId((short)2);
        System.out.println(categoryService.selectOne(category));
    }

    @Test
    public void testUpdate(){
        Category category = new Category();
        category.setCatId((short)2);
        category.setCatName("儿童书包呀");
        System.out.println(categoryService.update(category));
    }

    @Test
    public void testAdd(){
        Category category = new Category();
        category.setCatName("测试");
        category.setKeywords("");
        category.setCatDesc("");
        category.setParentId((short)0);
        category.setSortOrder(false);
        category.setTemplateFile("");
        category.setMeasureUnit("");
        category.setShowInNav(false);
        category.setStyle("");
        category.setIsShow(false);
        category.setGrade((byte)0);
        category.setFilterAttr("");

        System.out.println(categoryService.insert(category));
    }

    @Test
    public void testDelete(){
        Category category = new Category();
        category.setCatName("");
        System.out.println(categoryService.delete(category));
    }

    @Test
    public void testCount(){
        System.out.println(categoryService.count(null));
    }

    @Test
    public void testPage(){
        System.out.println(categoryService.page(2,5,null));
    }

    @Test
    public void testExtend(){
        System.out.println(categoryService.selectLastOne());
    }
}
