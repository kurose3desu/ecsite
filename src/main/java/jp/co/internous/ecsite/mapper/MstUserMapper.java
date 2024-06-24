package jp.co.internous.ecsite.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.ecsite.domain.MstUser;
import jp.co.internous.ecsite.form.LoginForm;

@Mapper
public interface MstUserMapper {
	
	@Select(value="SELECT * FROM mst_user WHERE user_name = #{userName} AND password = #{password}")
	MstUser findByUserNameAndPassword(LoginForm form);
	

}
