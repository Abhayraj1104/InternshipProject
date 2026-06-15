package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Role;
import com.example.entity.Upi;
import com.example.service.RoleCreateService;
import com.example.service.RoleDeleteService;
import com.example.service.RoleFetchAllService;
import com.example.service.RoleFetchService;
import com.example.service.RoleUpdateService;

@RestController
@RequestMapping("/role")
@CrossOrigin("*")
public class RoleController {
	@Autowired
    private RoleCreateService roleCreateService;

    @Autowired
    private RoleDeleteService roleDeleteService;

    @Autowired
    private RoleUpdateService roleUpdateService;

    @Autowired
    private RoleFetchService roleFetchService;

    @Autowired
    private RoleFetchAllService roleFetchAllService;
    

    public RoleController(RoleCreateService roleCreateService, RoleDeleteService roleDeleteService,
			RoleUpdateService roleUpdateService, RoleFetchService roleFetchService,
			RoleFetchAllService roleFetchAllService) {
		super();
		this.roleCreateService = roleCreateService;
		this.roleDeleteService = roleDeleteService;
		this.roleUpdateService = roleUpdateService;
		this.roleFetchService = roleFetchService;
		this.roleFetchAllService = roleFetchAllService;
	}

	@PostMapping("/save")
    public Role saveRole(@RequestBody Role role) {
        return roleCreateService.addData(role);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRole(@PathVariable Long id) {
        roleDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Role> fetchAllRole() {
        return roleFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Role fetchRole(@PathVariable Long id) {
        return roleFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Role updateRole(@RequestBody Role role,
                         @PathVariable Long id) {
        return roleUpdateService.updateData(role, id);
    }

}
