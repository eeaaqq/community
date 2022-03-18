/*
1.Mapper的作用 通用Mapper可以通过 Mybatis 的拦截器原理，
动态的帮我们实现单表的增删改查功能，大大降低了我们的开发成本，减少了我们的工作量。
 */
package life.majiang.community.community.mapper;

import life.majiang.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user(name,accout_id,token,gmt_create,gmt_modified) values (#{name},#{accout_id},#{token},#{gmt_create},#{gmt_modified})")
    void insert(User user);

}
