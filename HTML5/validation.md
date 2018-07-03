validation
==========

If you're using HTML5 validation, then stick to the markup.


Dia
 Otherwise, you can disable HTML5 validation with $form.attr('novalidate', 'novalidate') and use JS to validate your fields, and then adding valid or invalid classes where needed. I made a plugin that works like this to support non HTML5 browsers.