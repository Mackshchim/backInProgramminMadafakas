package tatar.mackshchim.lilayka.DAOs;

import org.jetbrains.annotations.NotNull;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import tatar.mackshchim.lilayka.models.User;

import java.sql.ResultSet;
import java.sql.SQLException;

@Deprecated
public class JdbcUserDao extends JdbcDaoSupport implements UserDao {
    private final String SQL_INSERT_USER = "INSERT INTO public.\"Users\" VALUES (?,?,?,?)";
    private final String SQL_SELECT_USER_BY_ID = "SELECT * FROM public.\"Users\" WHERE id = ?";


    public void addUser(@NotNull User user) {
        getJdbcTemplate().update(SQL_INSERT_USER,
                user.getUserId(),
                user.getUsername(),
                user.getPassword(),
                user.getAboutUser());
    }

    public User getUserById(long id) {
        return getJdbcTemplate().queryForObject(

                SQL_SELECT_USER_BY_ID,

                new BeanPropertyRowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNumber) throws SQLException {
                User user = new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));
                user.setAboutUser(rs.getString(4));
                return user;
            }
        },

                id

        );
    }
}
