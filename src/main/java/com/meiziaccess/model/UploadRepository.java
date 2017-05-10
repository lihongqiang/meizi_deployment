package com.meiziaccess.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by user-u1 on 2016/11/20.
 */
public interface UploadRepository extends JpaRepository<UploadItem, Long> {
    List<UploadItem> findUploadItemByMd5(String md5);

    List<UploadItem> findByStatus(int status);

    List<UploadItem> findByTitle(String title);

}
