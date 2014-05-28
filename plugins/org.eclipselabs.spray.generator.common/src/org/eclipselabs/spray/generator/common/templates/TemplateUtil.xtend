/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.generator.common.templates
 

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*
import org.eclipse.emf.ecore.EReference

class TemplateUtil extends Object {
    
    def header(Object templateClass) '''
        /*************************************************************************************
         *
         * Generated «timestamp()»by Spray «templateClass.getClass().simpleName».xtend
         *
         * This file contains generated and should not be changed.
         * Use the extension point class (the direct subclass of this class) to add manual code
         *
         *************************************************************************************/
    '''

    def extensionHeader(Object templateClass) '''
        /*************************************************************************************
         *
         * Generated «timestamp()»by Spray «templateClass.getClass().simpleName».xtend
         * 
         * This file is an extension point: copy to "src" folder to manually add code to this
         * extension point.
         *
         *************************************************************************************/
    '''

    def pluginHeader(Object templateClass) '''
        <!--
         Generated «timestamp()»by Spray «templateClass.getClass().simpleName».xtend
         This file will be generated only once if it need to be regenerated, remove this file.
         
        -->
    '''

    /**
     * Generate the full expression to calculate the value of a Text, existing of string literals and navigation expressions
     */
//    def CharSequence valueGenerator(TextInSpray text, String metaClassVariable)    {
//        try {
//            compiler.metaClassVariable = metaClassVariable
//            val body = compiler.compile(text.value, new ImportManager(false))
//            val result = new StringConcatenation()
//            result.append(body)
//            return result
//        } finally {
//            compiler.metaClassVariable = null
//        }
//    }
    
    /**
     * Generate an Override annotation and Javadoc inheritance 
     */
    def overrideHeader () '''
        /**
         * {@inheritDoc}
         */
        @Override
    '''
    
    def addOrSetReference(EReference ref, String containerName, String elementName)'''
        «IF ref.many»
            «containerName».get«ref.name.toFirstUpper»().add(«elementName»);
        «ELSE»
            «containerName».set«ref.name.toFirstUpper»(«elementName»);
        «ENDIF»
    '''
}