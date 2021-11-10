package ua.lyubchenko.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import ua.lyubchenko.domains.Company;

public interface IControllers<T> {

    String read(Model model);

    String get(@PathVariable("id") int id, Model model);

    String newCompany(@ModelAttribute T entity);

    String create(@ModelAttribute T entity);

    String edit(@PathVariable("id") int id, Model model);

    String update(@PathVariable("id") int id, @ModelAttribute("company") T entity);

    String delete(@PathVariable("id") int id);
}
