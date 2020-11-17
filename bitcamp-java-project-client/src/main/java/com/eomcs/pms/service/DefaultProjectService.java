package com.eomcs.pms.service;

import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.util.SqlSessionFactoryProxy;

public class DefaultProjectService implements ProjectService{

  TaskDao taskDao;
  ProjectDao projectDao;
  SqlSessionFactoryProxy factoryProxy;

  public DefaultProjectService(TaskDao taskDao, ProjectDao projectDao, SqlSessionFactoryProxy factoryProxy) {
    this.taskDao = taskDao;
    this.projectDao = projectDao;
    this.factoryProxy = factoryProxy;
  }
  @Override
  public int delete(int no) throws Exception {
    try {
      factoryProxy.startTransaction();
      taskDao.deleteByProjectNo(no);
      projectDao.deleteMembers(no);
      int count = projectDao.delete(no);
      factoryProxy.commit();
      return count;

    } catch (Exception e) {
      factoryProxy.rollback();
      throw e; // 서비스 객체에서 발생한 예외는 호출자에게 전달한다.

    } finally {
      factoryProxy.endTransaction();
   }
  }
}
