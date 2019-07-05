package ve.com.sios.gpff.common.dao;

import java.io.Serializable;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * The Class AbstractJdbcDao.
 *
 * @param <T> the generic type
 * @param <K> the key type
 */
public abstract class AbstractJdbcDao<T, K extends Serializable> implements GenericDao<T, K> {

    /** The jdbc template. */
    @Inject
    private JdbcTemplate jdbcTemplate;

    /**
     * Gets the jdbc template.
     *
     * @return the jdbc template
     */
    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

    /**
     * Sets the jdbc template.
     *
     * @param jdbcTemplate the new jdbc template
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
