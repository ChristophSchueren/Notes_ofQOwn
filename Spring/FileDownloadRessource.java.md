FileDownloadRessource.java
==========================
```

@GetMapping("/datei-anhangs/downloadSimple")
    @Timed
    public @ResponseBody
    void spiritTesting(HttpServletResponse response) throws IOException {
        log.debug("REST request to DOWNload file");
        prepareResponse(response, "hallo.txt" , getFileErstatz());
    }

    private byte[] getFileErstatz(){
        String string = "hallo REST file";
        byte[] b = string.getBytes(StandardCharsets.UTF_8);
        return b;
    }

    private void prepareResponse(HttpServletResponse response, String filename, byte[] file) throws IOException {
        long startTime = System.currentTimeMillis();
        response.setContentType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        response.setHeader("Content-Disposition", "inline; filename=" + filename);
        FileCopyUtils.copy(file, response.getOutputStream());
        long elapsedTime = System.currentTimeMillis() - startTime;
        log.debug("elapsed: {}", elapsedTime);
    }
```

# DateiUpload (Mulitpart)

```

/**
     * Endpoint zum multi-file upload
     * Inhalt wird verworfen > nul
     * needs authentication
     */
    @PostMapping("/datei-anhangs/upload")
    @Secured({AuthoritiesConstants.ADMIN, AuthoritiesConstants.OFFICE})
    @Timed
    public ResponseEntity<DateiAnhang> uploadFile(@RequestBody MultipartFile multipartFile) throws URISyntaxException, IOException {
        log.debug("REST request to UPload file : {}", multipartFile.getName());

        DateiAnhang result = dateiAnhangService.saveFile(multipartFile, "geraetIdDummy");
        return ResponseEntity.created(new URI("/api/datei-anhangs/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);

    }

```

