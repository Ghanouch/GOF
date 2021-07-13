package com.gof.STRUCTURAL_PATTERNS.FILTER;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
