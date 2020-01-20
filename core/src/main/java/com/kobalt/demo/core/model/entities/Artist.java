package com.kobalt.demo.core.model.entities;

import com.kobalt.demo.core.model.values.ISIN;
import com.kobalt.demo.core.model.values.Name;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Artist {
    Name name;
    final ISIN isin;
}
