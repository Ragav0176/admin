package com.tns.adminservice;

import org.springframework.data.jpa.repository.JpaRepository;
public interface AdminRepository extends JpaRepository<Admin, Long>
{

}
