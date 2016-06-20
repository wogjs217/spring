package etc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//��Ʈ�ѷ��� ��û�� ���޵Ǳ� ���̳� ��û�� ó���ϰ� �� �Ŀ� ������ �ڵ�
//��� ��Ʈ�ѷ��� ���ͼ��͸� �����ϰ� ����� �� �ֵ��� ������ ���� �ְ� Ư�� ��Ʈ�ѷ��� ���ͼ��͸� �����ϰ� 
//����ǵ��� ������ �� �ִ�.
public class TimeCheckInterceptor extends HandlerInterceptorAdapter{
	private long start;
	private long end;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("===================preHandle===================");
		System.out.println("������ ip=====>"+request.getRemoteHost());
		start = System.nanoTime();
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		end = System.nanoTime();
		System.out.println("=================postHandle====================");
		String handlerClass = handler.getClass().getName();
		System.out.println(handlerClass+"���࿡ �ɸ��ð�"+(end-start));
	}	
}
