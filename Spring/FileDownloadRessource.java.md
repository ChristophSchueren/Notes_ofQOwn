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


