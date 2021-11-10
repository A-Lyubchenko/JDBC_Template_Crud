package ua.lyubchenko.controllers.entityControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.lyubchenko.controllers.IControllers;
import ua.lyubchenko.domains.Project;
import ua.lyubchenko.repositories.entityRepositories.ProjectRepositories;

@Controller
@RequestMapping("projects")
public class ProjectControllers implements IControllers<Project> {
    private final ProjectRepositories projectRepositories;

    public ProjectControllers(ProjectRepositories projectRepositories) {
        this.projectRepositories = projectRepositories;
    }

    @Override
    @GetMapping()
    public String read(Model model) {
        model.addAttribute("projects", projectRepositories.read());
        return "projectsViews/read";
    }

    @Override
    @GetMapping("{id}")
    public String get(@PathVariable("id") int id, Model model) {
        model.addAttribute("project", projectRepositories.get(id));
        return "projectsViews/get";
    }

    @Override
    @GetMapping("new")
    public String newCompany(@ModelAttribute("project") Project project) {
        return "projectsViews/create";
    }

    @Override
    @PostMapping()
    public String create(@ModelAttribute("project") Project project) {
        projectRepositories.create(project);
        return "redirect:projects";
    }

    @Override
    @GetMapping("{id}/update")
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("project", projectRepositories.get(id));
        return "projectsViews/update";
    }

    @Override
    @PatchMapping("{id}")
    public String update(@PathVariable("id") int id, @ModelAttribute("project") Project project) {
        projectRepositories.update(id, project);
        return "redirect:/projects";
    }

    @Override
    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") int id) {
        projectRepositories.delete(id);
        return "redirect:/projects";
    }
}
