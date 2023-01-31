﻿using Microsoft.EntityFrameworkCore;
using Microsoft.Identity.Client;

namespace SuperHeroBackApi.Data
{
    public class DataContext:DbContext
    {
        public DataContext(DbContextOptions<DataContext> options) : base(options) { }
        
        public DbSet<SuperHero> SuperHeroes { get; set; }
        
    }
}
