package ve.com.sios.gpff.common.dao;

import java.io.Serializable;
import java.util.List;

import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Interface GenericDao.
 *
 * @param <T> the generic type
 * @param <K> the key type
 */
public interface GenericDao<T, K extends Serializable> {

    /**
     * Do insert.
     *
     * @param paramT the param T
     * @param authorizationData the authorization data
     * @return the k
     * @throws GpffDaoException the gpff dao exception
     */
    K doInsert(T paramT, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Do count.
     *
     * @param paramT the param T
     * @param authorizationData the authorization data
     * @return the k
     * @throws GpffDaoException the gpff dao exception
     */
    K doCount(T paramT, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Do select.
     *
     * @param paramT the param T
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the gpff dao exception
     */
    List<T> doSelect(T paramT, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Do update.
     *
     * @param paramT the param T
     * @param authorizationData the authorization data
     * @return true, if successful
     * @throws GpffDaoException the gpff dao exception
     */
    boolean doUpdate(T paramT, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Do select one.
     *
     * @param paramT the param T
     * @param authorizationData the authorization data
     * @return the t
     * @throws GpffDaoException the gpff dao exception
     */
    T doSelectOne(T paramT, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Do delete.
     *
     * @param paramT the param T
     * @param authorizationData the authorization data
     * @throws GpffDaoException the gpff dao exception
     */
    void doDelete(T paramT, AuthorizationData authorizationData) throws GpffDaoException;

}
