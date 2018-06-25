package com.consistent.ucwrt.service.persistence;

import com.consistent.ucwrt.NoSuchEntityClassException;
import com.consistent.ucwrt.model.EntityClass;
import com.consistent.ucwrt.model.impl.EntityClassImpl;
import com.consistent.ucwrt.model.impl.EntityClassModelImpl;
import com.consistent.ucwrt.service.persistence.EntityClassPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the entity class service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityClassPersistence
 * @see EntityClassUtil
 * @generated
 */
public class EntityClassPersistenceImpl extends BasePersistenceImpl<EntityClass>
    implements EntityClassPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityClassUtil} to access the entity class persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityClassImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityClassModelImpl.FINDER_CACHE_ENABLED, EntityClassImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityClassModelImpl.FINDER_CACHE_ENABLED, EntityClassImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityClassModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_CLASSNAME = new FinderPath(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityClassModelImpl.FINDER_CACHE_ENABLED, EntityClassImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByClassName",
            new String[] { String.class.getName() },
            EntityClassModelImpl.CLASSNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CLASSNAME = new FinderPath(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityClassModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByClassName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CLASSNAME_CLASSNAME_1 = "entityClass.className IS NULL";
    private static final String _FINDER_COLUMN_CLASSNAME_CLASSNAME_2 = "entityClass.className = ?";
    private static final String _FINDER_COLUMN_CLASSNAME_CLASSNAME_3 = "(entityClass.className IS NULL OR entityClass.className = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_CLASSID = new FinderPath(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityClassModelImpl.FINDER_CACHE_ENABLED, EntityClassImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByClassId",
            new String[] { Integer.class.getName() },
            EntityClassModelImpl.CLASSID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CLASSID = new FinderPath(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityClassModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByClassId",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_CLASSID_CLASSID_2 = "entityClass.classId = ?";
    private static final String _SQL_SELECT_ENTITYCLASS = "SELECT entityClass FROM EntityClass entityClass";
    private static final String _SQL_SELECT_ENTITYCLASS_WHERE = "SELECT entityClass FROM EntityClass entityClass WHERE ";
    private static final String _SQL_COUNT_ENTITYCLASS = "SELECT COUNT(entityClass) FROM EntityClass entityClass";
    private static final String _SQL_COUNT_ENTITYCLASS_WHERE = "SELECT COUNT(entityClass) FROM EntityClass entityClass WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityClass.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityClass exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EntityClass exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityClassPersistenceImpl.class);
    private static EntityClass _nullEntityClass = new EntityClassImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityClass> toCacheModel() {
                return _nullEntityClassCacheModel;
            }
        };

    private static CacheModel<EntityClass> _nullEntityClassCacheModel = new CacheModel<EntityClass>() {
            @Override
            public EntityClass toEntityModel() {
                return _nullEntityClass;
            }
        };

    public EntityClassPersistenceImpl() {
        setModelClass(EntityClass.class);
    }

    /**
     * Returns the entity class where className = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityClassException} if it could not be found.
     *
     * @param className the class name
     * @return the matching entity class
     * @throws com.consistent.ucwrt.NoSuchEntityClassException if a matching entity class could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass findByClassName(String className)
        throws NoSuchEntityClassException, SystemException {
        EntityClass entityClass = fetchByClassName(className);

        if (entityClass == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("className=");
            msg.append(className);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchEntityClassException(msg.toString());
        }

        return entityClass;
    }

    /**
     * Returns the entity class where className = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param className the class name
     * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass fetchByClassName(String className)
        throws SystemException {
        return fetchByClassName(className, true);
    }

    /**
     * Returns the entity class where className = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param className the class name
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass fetchByClassName(String className,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { className };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CLASSNAME,
                    finderArgs, this);
        }

        if (result instanceof EntityClass) {
            EntityClass entityClass = (EntityClass) result;

            if (!Validator.equals(className, entityClass.getClassName())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_ENTITYCLASS_WHERE);

            boolean bindClassName = false;

            if (className == null) {
                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_1);
            } else if (className.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_3);
            } else {
                bindClassName = true;

                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindClassName) {
                    qPos.add(className);
                }

                List<EntityClass> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAME,
                        finderArgs, list);
                } else {
                    EntityClass entityClass = list.get(0);

                    result = entityClass;

                    cacheResult(entityClass);

                    if ((entityClass.getClassName() == null) ||
                            !entityClass.getClassName().equals(className)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAME,
                            finderArgs, entityClass);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSNAME,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (EntityClass) result;
        }
    }

    /**
     * Removes the entity class where className = &#63; from the database.
     *
     * @param className the class name
     * @return the entity class that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass removeByClassName(String className)
        throws NoSuchEntityClassException, SystemException {
        EntityClass entityClass = findByClassName(className);

        return remove(entityClass);
    }

    /**
     * Returns the number of entity classes where className = &#63;.
     *
     * @param className the class name
     * @return the number of matching entity classes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByClassName(String className) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CLASSNAME;

        Object[] finderArgs = new Object[] { className };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYCLASS_WHERE);

            boolean bindClassName = false;

            if (className == null) {
                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_1);
            } else if (className.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_3);
            } else {
                bindClassName = true;

                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindClassName) {
                    qPos.add(className);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the entity class where classId = &#63; or throws a {@link com.consistent.ucwrt.NoSuchEntityClassException} if it could not be found.
     *
     * @param classId the class ID
     * @return the matching entity class
     * @throws com.consistent.ucwrt.NoSuchEntityClassException if a matching entity class could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass findByClassId(int classId)
        throws NoSuchEntityClassException, SystemException {
        EntityClass entityClass = fetchByClassId(classId);

        if (entityClass == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("classId=");
            msg.append(classId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchEntityClassException(msg.toString());
        }

        return entityClass;
    }

    /**
     * Returns the entity class where classId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param classId the class ID
     * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass fetchByClassId(int classId) throws SystemException {
        return fetchByClassId(classId, true);
    }

    /**
     * Returns the entity class where classId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param classId the class ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching entity class, or <code>null</code> if a matching entity class could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass fetchByClassId(int classId, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { classId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CLASSID,
                    finderArgs, this);
        }

        if (result instanceof EntityClass) {
            EntityClass entityClass = (EntityClass) result;

            if ((classId != entityClass.getClassId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_ENTITYCLASS_WHERE);

            query.append(_FINDER_COLUMN_CLASSID_CLASSID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(classId);

                List<EntityClass> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSID,
                        finderArgs, list);
                } else {
                    EntityClass entityClass = list.get(0);

                    result = entityClass;

                    cacheResult(entityClass);

                    if ((entityClass.getClassId() != classId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSID,
                            finderArgs, entityClass);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (EntityClass) result;
        }
    }

    /**
     * Removes the entity class where classId = &#63; from the database.
     *
     * @param classId the class ID
     * @return the entity class that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass removeByClassId(int classId)
        throws NoSuchEntityClassException, SystemException {
        EntityClass entityClass = findByClassId(classId);

        return remove(entityClass);
    }

    /**
     * Returns the number of entity classes where classId = &#63;.
     *
     * @param classId the class ID
     * @return the number of matching entity classes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByClassId(int classId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CLASSID;

        Object[] finderArgs = new Object[] { classId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ENTITYCLASS_WHERE);

            query.append(_FINDER_COLUMN_CLASSID_CLASSID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(classId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the entity class in the entity cache if it is enabled.
     *
     * @param entityClass the entity class
     */
    @Override
    public void cacheResult(EntityClass entityClass) {
        EntityCacheUtil.putResult(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityClassImpl.class, entityClass.getPrimaryKey(), entityClass);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAME,
            new Object[] { entityClass.getClassName() }, entityClass);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSID,
            new Object[] { entityClass.getClassId() }, entityClass);

        entityClass.resetOriginalValues();
    }

    /**
     * Caches the entity classes in the entity cache if it is enabled.
     *
     * @param entityClasses the entity classes
     */
    @Override
    public void cacheResult(List<EntityClass> entityClasses) {
        for (EntityClass entityClass : entityClasses) {
            if (EntityCacheUtil.getResult(
                        EntityClassModelImpl.ENTITY_CACHE_ENABLED,
                        EntityClassImpl.class, entityClass.getPrimaryKey()) == null) {
                cacheResult(entityClass);
            } else {
                entityClass.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity classes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityClassImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityClassImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity class.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityClass entityClass) {
        EntityCacheUtil.removeResult(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityClassImpl.class, entityClass.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(entityClass);
    }

    @Override
    public void clearCache(List<EntityClass> entityClasses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityClass entityClass : entityClasses) {
            EntityCacheUtil.removeResult(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
                EntityClassImpl.class, entityClass.getPrimaryKey());

            clearUniqueFindersCache(entityClass);
        }
    }

    protected void cacheUniqueFindersCache(EntityClass entityClass) {
        if (entityClass.isNew()) {
            Object[] args = new Object[] { entityClass.getClassName() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CLASSNAME, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAME, args,
                entityClass);

            args = new Object[] { entityClass.getClassId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CLASSID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSID, args,
                entityClass);
        } else {
            EntityClassModelImpl entityClassModelImpl = (EntityClassModelImpl) entityClass;

            if ((entityClassModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_CLASSNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { entityClass.getClassName() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CLASSNAME, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAME, args,
                    entityClass);
            }

            if ((entityClassModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_CLASSID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { entityClass.getClassId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CLASSID, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSID, args,
                    entityClass);
            }
        }
    }

    protected void clearUniqueFindersCache(EntityClass entityClass) {
        EntityClassModelImpl entityClassModelImpl = (EntityClassModelImpl) entityClass;

        Object[] args = new Object[] { entityClass.getClassName() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSNAME, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSNAME, args);

        if ((entityClassModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_CLASSNAME.getColumnBitmask()) != 0) {
            args = new Object[] { entityClassModelImpl.getOriginalClassName() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSNAME, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSNAME, args);
        }

        args = new Object[] { entityClass.getClassId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSID, args);

        if ((entityClassModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_CLASSID.getColumnBitmask()) != 0) {
            args = new Object[] { entityClassModelImpl.getOriginalClassId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSID, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSID, args);
        }
    }

    /**
     * Creates a new entity class with the primary key. Does not add the entity class to the database.
     *
     * @param classId the primary key for the new entity class
     * @return the new entity class
     */
    @Override
    public EntityClass create(int classId) {
        EntityClass entityClass = new EntityClassImpl();

        entityClass.setNew(true);
        entityClass.setPrimaryKey(classId);

        return entityClass;
    }

    /**
     * Removes the entity class with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param classId the primary key of the entity class
     * @return the entity class that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityClassException if a entity class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass remove(int classId)
        throws NoSuchEntityClassException, SystemException {
        return remove((Serializable) classId);
    }

    /**
     * Removes the entity class with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity class
     * @return the entity class that was removed
     * @throws com.consistent.ucwrt.NoSuchEntityClassException if a entity class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass remove(Serializable primaryKey)
        throws NoSuchEntityClassException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityClass entityClass = (EntityClass) session.get(EntityClassImpl.class,
                    primaryKey);

            if (entityClass == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityClassException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityClass);
        } catch (NoSuchEntityClassException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityClass removeImpl(EntityClass entityClass)
        throws SystemException {
        entityClass = toUnwrappedModel(entityClass);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityClass)) {
                entityClass = (EntityClass) session.get(EntityClassImpl.class,
                        entityClass.getPrimaryKeyObj());
            }

            if (entityClass != null) {
                session.delete(entityClass);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityClass != null) {
            clearCache(entityClass);
        }

        return entityClass;
    }

    @Override
    public EntityClass updateImpl(
        com.consistent.ucwrt.model.EntityClass entityClass)
        throws SystemException {
        entityClass = toUnwrappedModel(entityClass);

        boolean isNew = entityClass.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityClass.isNew()) {
                session.save(entityClass);

                entityClass.setNew(false);
            } else {
                session.merge(entityClass);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EntityClassModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
            EntityClassImpl.class, entityClass.getPrimaryKey(), entityClass);

        clearUniqueFindersCache(entityClass);
        cacheUniqueFindersCache(entityClass);

        return entityClass;
    }

    protected EntityClass toUnwrappedModel(EntityClass entityClass) {
        if (entityClass instanceof EntityClassImpl) {
            return entityClass;
        }

        EntityClassImpl entityClassImpl = new EntityClassImpl();

        entityClassImpl.setNew(entityClass.isNew());
        entityClassImpl.setPrimaryKey(entityClass.getPrimaryKey());

        entityClassImpl.setClassId(entityClass.getClassId());
        entityClassImpl.setClassName(entityClass.getClassName());

        return entityClassImpl;
    }

    /**
     * Returns the entity class with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity class
     * @return the entity class
     * @throws com.consistent.ucwrt.NoSuchEntityClassException if a entity class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityClassException, SystemException {
        EntityClass entityClass = fetchByPrimaryKey(primaryKey);

        if (entityClass == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityClassException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityClass;
    }

    /**
     * Returns the entity class with the primary key or throws a {@link com.consistent.ucwrt.NoSuchEntityClassException} if it could not be found.
     *
     * @param classId the primary key of the entity class
     * @return the entity class
     * @throws com.consistent.ucwrt.NoSuchEntityClassException if a entity class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass findByPrimaryKey(int classId)
        throws NoSuchEntityClassException, SystemException {
        return findByPrimaryKey((Serializable) classId);
    }

    /**
     * Returns the entity class with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity class
     * @return the entity class, or <code>null</code> if a entity class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityClass entityClass = (EntityClass) EntityCacheUtil.getResult(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
                EntityClassImpl.class, primaryKey);

        if (entityClass == _nullEntityClass) {
            return null;
        }

        if (entityClass == null) {
            Session session = null;

            try {
                session = openSession();

                entityClass = (EntityClass) session.get(EntityClassImpl.class,
                        primaryKey);

                if (entityClass != null) {
                    cacheResult(entityClass);
                } else {
                    EntityCacheUtil.putResult(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
                        EntityClassImpl.class, primaryKey, _nullEntityClass);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityClassModelImpl.ENTITY_CACHE_ENABLED,
                    EntityClassImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityClass;
    }

    /**
     * Returns the entity class with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param classId the primary key of the entity class
     * @return the entity class, or <code>null</code> if a entity class with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityClass fetchByPrimaryKey(int classId) throws SystemException {
        return fetchByPrimaryKey((Serializable) classId);
    }

    /**
     * Returns all the entity classes.
     *
     * @return the entity classes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityClass> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity classes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity classes
     * @param end the upper bound of the range of entity classes (not inclusive)
     * @return the range of entity classes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityClass> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity classes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.consistent.ucwrt.model.impl.EntityClassModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity classes
     * @param end the upper bound of the range of entity classes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity classes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityClass> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<EntityClass> list = (List<EntityClass>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYCLASS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYCLASS;

                if (pagination) {
                    sql = sql.concat(EntityClassModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityClass>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityClass>(list);
                } else {
                    list = (List<EntityClass>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the entity classes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityClass entityClass : findAll()) {
            remove(entityClass);
        }
    }

    /**
     * Returns the number of entity classes.
     *
     * @return the number of entity classes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_ENTITYCLASS);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the entity class persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.consistent.ucwrt.model.EntityClass")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityClass>> listenersList = new ArrayList<ModelListener<EntityClass>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityClass>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityClassImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
