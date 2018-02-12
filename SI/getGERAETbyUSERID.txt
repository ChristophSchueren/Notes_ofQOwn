C:\Users\Christoph\SpiritInventory\src\test\java\com\spirittesting\spiritinventory\web\rest\GeraetResourceIntTest.java


 @Test
    @Transactional
    public void getAllGeraetsByUserIsEqualToSomething() throws Exception {
        // Initialize the database
        User user = UserResourceIntTest.createEntity(em);
        em.persist(user);
        em.flush();
        geraet.setUser(user);
        geraetRepository.saveAndFlush(geraet);
        Long userId = user.getId();

        // Get all the geraetList where user equals to userId
        defaultGeraetShouldBeFound("userId.equals=" + userId);

        // Get all the geraetList where user equals to userId + 1
        defaultGeraetShouldNotBeFound("userId.equals=" + (userId + 1));
    }


    /**
     * Executes the search, and checks that the default entity is returned
     */
    private void defaultGeraetShouldBeFound(String filter) throws Exception {
        restGeraetMockMvc.perform(get("/api/geraets?sort=id,desc&" + filter))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(geraet.getId().intValue())))
            .andExpect(jsonPath("$.[*].type").value(hasItem(DEFAULT_TYPE.toString())))
            .andExpect(jsonPath("$.[*].standort").value(hasItem(DEFAULT_STANDORT.toString())))
            .andExpect(jsonPath("$.[*].verfuegbarkeit").value(hasItem(DEFAULT_VERFUEGBARKEIT.toString())));
    }


/api/geraets?userId.equals=123

$ curl -X GET --header 'Accept: application/json' --header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTUxNjI4MTQ2OX0.ufiuPqWedU0JDcaSBAf9w7YfZAr5ZeSWkdEsmCABFUpK85dPM_3k69A7nPS1aSKiRoZ37QPqazqHGa1Ap42L3w' 'http://localhost:9060/api/geraets?id.equals=1003'


 curl -X GET --header 'Accept: application/json' --header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTUxNjI4MTQ2OX0.ufiuPqWedU0JDcaSBAf9w7YfZAr5ZeSWkdEsmCABFUpK85dPM_3k69A7nPS1aSKiRoZ37QPqazqHGa1Ap42L3w' 'http://localhost:9060/api/geraets?userId.equals=4'
