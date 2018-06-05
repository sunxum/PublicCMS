package com.publiccms.logic.service.sys;

import java.util.List;

// Generated 2018-6-5 18:21:28 by com.publiccms.common.generator.SourceGenerator

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.publiccms.common.base.BaseService;
import com.publiccms.entities.sys.SysModuleLang;
import com.publiccms.logic.dao.sys.SysModuleLangDao;

/**
 *
 * SysModuleLangService
 * 
 */
@Service
@Transactional
public class SysModuleLangService extends BaseService<SysModuleLang> {

    /**
     * 
     * @param moduleId
     * @param lang
     * @return results page
     */
    @Transactional(readOnly = true)
    public List<?> getList(String moduleId, String lang) {
        return dao.getList(moduleId, lang);
    }

    @Autowired
    private SysModuleLangDao dao;

}