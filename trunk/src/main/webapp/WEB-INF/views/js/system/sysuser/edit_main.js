require(['component/iframeLayer', 'common/util', 'common/http', 'layer1', 'jquery.validate', 'jquery.serialize'], function (layer, util, http) {


    init();

    /**
     * 初始化函数集合
     */

    function init() {
        formValid();
        bind();
    }

    /**
     * 表单验证
     */
    function formValid() {
        $('#sysUserForm').validate({
            rules: {
                username: {
                    required: true,
                    rangelength:[5,18]
                },
                password:{
                    rangelength:[6,18]
                },
                email: {
                    required: true
                }
            },
            messages: {
                username: {
                	required: '用户名不能为空',
                    rangelength:'登录账号长度必须是{0}到{1}之间'
                },
                password:{
                    rangelength:'登录密码长度必须是{0}到{1}之间'
                },
                email: {
                	 required: '电子邮件不能为空'
                }
            },
            /**
             * 如果想用layer.tips做验证提示，可以用这个方法
             * @param errorMap
             * @param errorList
             */
            showErrors: function (errorMap, errorList) {
                for (var i in errorMap) {
                    layer.tips(errorMap[i], $('#sysUserForm input[name=' + i + ']'), {
                        tips: 3,
                        tipsMore: true,
                        ltype: 0
                    });
                }
            },
            submitHandler: function () {
            	
            	//邮箱验证
            	var reg=/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((.[a-zA-Z0-9_-]{2,3}){1,2})$/;
                var email = $("#sysUserForm input[name='email']").val();
                if(!reg.test(email)){
                	layer.msg("邮箱格式不正确！", {time: 2000}, function() {});
                	$("#sysUserForm input[name='email']").focus();
                    return;
                }
            	
            	
                var formParam = $('#sysUserForm').serializeObject();
                http.httpRequest({
                    url: '/admin/system/sysuser/save',
                    serializable: true,
                    data: formParam,
                    type: 'post',
                    success: function (data) {
                        layer.msg(data.msg, {time: 1000}, function () {
                        	if(data.status == 'success'){
                        		layer.close({reload: true});
                        	}
                        });
                    }
                })
            }
        })
    }

    
    
    function bind() {
        util.bindEvents([{
            el: '#cancel',
            event: 'click',
            handler: function () {
                layer.close();
            }
        }])
    }

})